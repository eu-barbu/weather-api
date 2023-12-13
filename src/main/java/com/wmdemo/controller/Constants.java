package com.wmdemo.controller;

public class Constants {

    public static final String WEATHER_TEMPLATE = """
                {
              "coord": {
                "lon": -122.08,
                "lat": 37.39
              },
              "weather": [
                {
                  "id": 800,
                  "main": "Clear",
                  "description": "clear sky",
                  "icon": "01d"
                }
              ],
              "base": "stations",
              "main": {
                "temp": ${TEMP},
                "feels_like": ${TEMPFEEL},
                "temp_min": ${TEMPMIN},
                "temp_max": ${TEMPMAX},
                "pressure": 1023,
                "humidity": 53
              },
              "visibility": 16093,
              "wind": {
                "speed": 1.5,
                "deg": 350
              },
              "clouds": {
                "all": 1
              },
              "dt": 1560350645,
              "sys": {
                "type": 1,
                "id": 5122,
                "message": 0.0139,
                "country": "DE",
                "sunrise": 1560343627,
                "sunset": 1560396563
              },
              "timezone": -25200,
              "id": 420006353,
              "name": "${LOCATION}",
              "cod": 200
            }
            """;
}
