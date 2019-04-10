from flask import Flask
from flask import jsonify, json
import pandas as pd

app = Flask(__name__)


@app.route('/')
def index():
    return "HELLO WORLD"


@app.route('/users')
def disp_users():
    data = pd.read_json('users.json')
    data = data.values.tolist()
    return jsonify(data)


@app.route('/movies')
def disp_movies():
    data_movies = pd.read_json('movies.json')
    data_movies = data_movies.values.tolist()
    return jsonify(data_movies)


@app.route('/booking')
def disp_booking():
    data_booking = pd.read_json('booking.json')
    data_booking = data_booking.values.tolist()
    return jsonify(data_booking)


@app.route('/showtimes')
def disp_showtimes():
    data_showtimes = pd.read_json('showtimes.json')
    data_showtimes = data_showtimes.values.tolist()
    return jsonify(data_showtimes)


if __name__ == '__main__':
    app.run(debug=True)
