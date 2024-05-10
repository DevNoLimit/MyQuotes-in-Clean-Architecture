<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
  <h1>MyQuotes-in-Clean-Architecture</h1>

  <h2>Project Overview</h2>
  <p>This project demonstrates a clean architecture implementation for an Android quotes application using Jetpack Compose, Dagger Hilt, Navigation, Retrofit, and Version Catalog.</p>

  <h3>Technologies Used</h3>
  <ul>
    <li>Jetpack Compose: Modern UI framework for declarative and composable UI development.</li>
    <li>Dagger Hilt: Dependency injection library for simplifying dependency management.</li>
    <li>Navigation: Navigation library for handling in-app navigation.</li>
    <li>Retrofit: Type-safe HTTP client for interacting with APIs.</li>
    <li>Toml: Version Catalog format for managing project dependencies.</li>
  </ul>

  <h2>Getting Started</h2>

  <h3>Prerequisites</h3>
  <ul>
    <li>Android Studio with latest plugins</li>
    <li>Basic understanding of Android development and Clean Architecture</li>
  </ul>

  <h3>Running the App</h3>
  <ol>
    <li>Clone the repository.</li>
    <li>Open the project in Android Studio.</li>
    <li>Ensure you have the necessary dependencies installed (defined in the `version-catalog.toml` file).</li>
    <li>Run the app on an emulator or connected device.</li>
  </ol>

  <h2>Project Structure</h2>
  <p>The project follows a clean architecture structure, with separation between:</p>
  <ul>
    <li>Presentation Layer (Jetpack Compose UI): Responsible for displaying data and handling user interactions.</li>
    <li>Data Layer (Retrofit, Room): Responsible for fetching and storing data.</li>
    <li>Domain Layer: Business logic and core functionalities of the application.</li>
  </ul>

  <h2>Additional Information</h2>
  <p>For detailed code explanations and specific implementation details, refer to the code comments within the project.</p>

  <h3>Contact</h3>
  <p>Feel free to reach out for any questions or feedback.</p>
</body>
</html>
