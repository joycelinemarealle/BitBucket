from flask import Flask
app = Flask (__name__)

@app.route("/")
def hello_world():
    return "<p>Hello, World!</p>"

@app.route("/day_of_week")
def what_day_is_it():
    days = ['Monday', 'Wednesday', 'Friday']
    return days

@app.route("/month_of_year")
def what_month_is_it():
    months = ['August', 'September', 'October', 'November', 'December']
    return months