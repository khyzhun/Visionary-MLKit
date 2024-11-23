# Object Recognition with ML Kit

This Android project uses Google's ML Kit to recognize objects through the camera and log the results, including the object detected and its probability score. The app allows users to start object recognition analysis and stores the detected data in a log file with the date, time, object name, and probability.

## Features
- **Real-Time Object Detection**: Uses the camera to capture and analyze the objects in the view.
- **Logging Results**: Logs the date, time, object name, and detection probability for each analysis.
- **Main Screen**: A simple UI with a button to start the analysis.
- **Settings Screen**: Configuration options for fine-tuning the app's behavior.

## Setup and Installation

### Prerequisites
- Android Studio
- Firebase setup (for ML Kit)
- An Android device or emulator to run the app

### Steps to Set Up

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yourusername/ObjectRecognitionMLKit.git
   ```

2. **Open the project in Android Studio.**

3. **Set up Firebase:**
   - Go to [Firebase Console](https://console.firebase.google.com/).
   - Create a new project and follow the instructions to add Firebase to your Android project.
   - Enable ML Kit's Object Detection API.

4. **Install Dependencies:**
   - In Android Studio, go to the `build.gradle` files and add the necessary dependencies for ML Kit.
   
   Example dependencies in `build.gradle` (app-level):

   ```gradle
   dependencies {
       implementation 'com.google.mlkit:object-detection:16.0.0'
       implementation 'com.google.firebase:firebase-ml-vision:24.0.3'
   }
   ```

5. **Configure Permissions:**
   Ensure your app has the required permissions to access the camera and write logs to the file system. Add the following permissions to your `AndroidManifest.xml`:

   ```xml
   <uses-permission android:name="android.permission.CAMERA" />
   <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
   ```

### How to Use
1. **Run the App on an Android Device.**
2. **Main Screen**: Tap the "Start Analysis" button to begin real-time object detection using the camera.
3. **Settings Screen**: Configure any additional options or preferences.
4. The app will display the detected object and its probability score in real-time and log the data in a file.

### Log Format

Each log entry will be recorded in the following format:

```
Date, Time, Object Name, Probability
```

Example log entry:
```
2024-11-22, 12:34:56, Dog, 0.92
```

### Future Improvements
- Add more object categories for detection.
- Improve performance and optimization for faster detection.
- Implement offline object recognition by downloading custom models.

## License
I don't give a fuck about licenses so feel free to copy-paste, download or even sell this shit. 
