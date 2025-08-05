import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

// Configuration for Real-Time Data Visualization Controller
object ControllerConfig {
    const val UPDATE_INTERVAL_MS = 1000 // Update interval in milliseconds
    const val MAX_DATA_POINTS = 100 // Maximum number of data points to display
    const val DATA_SOURCE_URL = "https://example.com/data" // URL for data source
    const val DATA_SOURCE_API_KEY = "YOUR_API_KEY_HERE" // API key for data source
}

// Data class for data points
@Serializable
data class DataPoint(val timestamp: Long, val value: Double)

// Configuration for visualization
object VisualizationConfig {
    const val CHART_TYPE = "line" // Type of chart (e.g. line, bar, pie)
    const val CHART_COLOR = "blue" // Color of the chart
    const val CHART_WIDTH = 800 // Width of the chart
    const val CHART_HEIGHT = 600 // Height of the chart
}

// JSON configuration for data serialization
val json = Json {
    prettyPrint = true
    indent = "    "
}