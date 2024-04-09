# Use the official OpenJDK 17 image as the base image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the packaged jar file into the container
COPY build/libs/Orders-0.0.1-SNAPSHOT.jar /app/Orders-0.0.1-SNAPSHOT.jar

# Set environment variables
ENV DB_PASSWORD=pass
ENV DB_URL=jdbc:mysql://192.168.49.2:31454/my_db
ENV DB_DDL_AUTO=create
ENV EUREKA_SERVER=http://192.168.49.2:31273/eureka

# Expose the port that your app runs on
EXPOSE 8080

# Run the jar file
CMD ["java", "-jar", "Orders-0.0.1-SNAPSHOT.jar"]
