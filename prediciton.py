import pandas as pd
from sklearn.ensemble import RandomForestRegressor
from datetime import datetime, timedelta

# Assuming you have a DataFrame named 'budget_data' with columns 'date_time', 'category', and 'amount'
budget_data['date_time'] = pd.to_datetime(budget_data['date_time'])  # Convert 'date_time' to datetime type

def predict_feature_expenses(category, month):
    # Filter the data for the specified category
    category_data = budget_data[budget_data['category'] == category].copy()

    # Generate features for prediction
    category_data['time_diff'] = (datetime.now() - category_data['date_time']).dt.days
    category_data['month'] = category_data['date_time'].dt.month

    # Split the data into features (X) and target variable (y)
    X = category_data[['time_diff', 'month']]
    y = category_data['amount']

    # Train a random forest regression model
    regressor = RandomForestRegressor()
    regressor.fit(X, y)

    # Prepare data for prediction
    future_date = datetime.now() + timedelta(days=30*month)
    future_data = pd.DataFrame({
        'time_diff': [(datetime.now() - future_date).days],
        'month': [future_date.month]
    })

    # Make predictions for the future data
    predicted_expenses = regressor.predict(future_data)

    return predicted_expenses


predicted_expenses = predict_feature_expenses('coffee', 1)
print(f"Predicted expenses for coffee, 1 month later: {predicted_expenses}")
