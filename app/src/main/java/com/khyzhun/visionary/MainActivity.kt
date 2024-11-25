package com.khyzhun.visionary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.khyzhun.visionary.ui.theme.VisionaryTheme
import timber.log.Timber

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VisionaryTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(innerPadding)
                }
            }
        }
    }
}

@Composable
fun MainScreen(innerPadding: PaddingValues) {
    val context = LocalContext.current

    // State to hold the camera feed or captured result
    var detectedObject by remember { mutableStateOf("No object detected") }
    var detectionProbability by remember { mutableFloatStateOf(0.0f) }

    // Button to start analysis
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Camera Preview - Placeholder (you'll replace this with CameraX implementation)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp)
                .background(Color.Gray) // Replace with actual Camera Preview
        ) {
            Text("Camera Feed Here", color = Color.White, modifier = Modifier.align(Alignment.Center))
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            // Start analysis logic
            // Call your ML Kit object detection function here
            detectedObject = "Dog"  // Example object
            detectionProbability = 0.92f  // Example probability
            Timber.d("Detected: $detectedObject with probability $detectionProbability")
        }) {
            Text(text = "Start Analysis")
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Display detected object and its probability
        Text(text = "Detected Object: $detectedObject", style = MaterialTheme.typography.bodyLarge)
        Text(text = "Probability: ${detectionProbability * 100}%", style = MaterialTheme.typography.bodyMedium)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VisionaryTheme {
        MainScreen(PaddingValues(0.dp))
    }
}