# Spring Boot Weather API

This is a simple Spring Boot application that provides the weather condition of a city using an external API. The application is deployed on Google Cloud and can be accessed through the following endpoint:

```bash
https://theta-topic-385706.uc.r.appspot.com/weather/{city_name}
```

## Prerequisites

Before running this project, make sure you have the following installed on your system:

- Java 8 or later
- Maven

## Running the Application

To run the application, follow these steps:

1. Clone the repository: `git clone https://github.com/Sandeep0925/React-WeatherAppBE.git`
2. Open the project in your preferred IDE
3. Set the API key for OpenWeatherMap in the `application.properties` file. You can get an API key by creating an account on the [OpenWeatherMap website](https://openweathermap.org/api).
4. Build the project by running the command: `mvn clean package`
5. Run the application by running the command: `java -jar target/weather-api-0.0.1-SNAPSHOT.jar`

The application will start running on `http://localhost:8080`. You can test the API by making a GET request to the following endpoint:

```bash
http://localhost:8080/weather/{city_name}
```

## Deployment

This project is deployed on Google Cloud using the App Engine. To deploy the project on Google Cloud, follow these steps:

1. Create a Google Cloud account and a new project
2. Install the [Google Cloud SDK](https://cloud.google.com/sdk/docs/install)
3. Authenticate the SDK by running the command: `gcloud auth login`
4. Set the project ID by running the command: `gcloud config set project PROJECT_ID`
5. Build the project by running the command: `mvn clean package`
6. Deploy the project by running the command: `gcloud app deploy target/weather-api-0.0.1-SNAPSHOT.jar`

Once the deployment is complete, you can access the API by making a GET request to the following endpoint:

```bash
https://PROJECT_ID.uc.r.appspot.com/weather/{city_name}
``` 

## Contributing

If you would like to contribute to this project, feel free to submit a pull request. Please make sure to follow the existing coding style and conventions.
