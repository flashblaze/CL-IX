from flask import Flask
from flask import jsonify, json, request
import pandas as pd

app = Flask(__name__)


@app.route('/')
def index():
    return "Hello!"


@app.route('/search_user', methods=['POST'])
def search_user():
    user = request.form['text']
    data = pd.read_json('person.json').values.tolist()
    if(user == data[0][0]['name']):
        return jsonify(data[0])
    elif(user == data[1][0]['name']):
        return jsonify(data[1])
    elif(user == data[2][0]['name']):
        return jsonify(data[2])
    else:
        return "No record"


if __name__ == '__main__':
    app.run(debug=True)
