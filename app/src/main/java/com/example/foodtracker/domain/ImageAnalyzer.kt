package com.example.foodtracker.domain


/*class ImageAnalyzer(
    var threshold: Float = 0.5f,
    var numThreads: Int = 2,
    var maxResults: Int = 3,
    val context: Context,
) {
    private var imageClassifier: ImageClassifier? = null

    init {
        setupImageClassifier()
    }

    private fun setupImageClassifier() {
        val optionsBuilder = ImageClassifier.ImageClassifierOptions.builder()
            .setScoreThreshold(threshold)
            .setMaxResults(maxResults)

        val baseOptionsBuilder = BaseOptions.builder().setNumThreads(numThreads)

        optionsBuilder.setBaseOptions(baseOptionsBuilder.build())

        val modelName = "nutritions.tflite"

        try {
            imageClassifier =
                ImageClassifier.createFromFileAndOptions(context, modelName, optionsBuilder.build())
        } catch (e: IllegalStateException) {
            Log.e("TFLite", "TFLite failed to load model with error: " + e.message)
        }
    }

    fun classify(image: Bitmap, rotation: Int): MutableList<Classifications>? {
        if (imageClassifier == null) {
            setupImageClassifier()
        }

        // Inference time is the difference between the system time at the start and finish of the
        // process
        var inferenceTime = SystemClock.uptimeMillis()

        // Create preprocessor for the image.
        // See https://www.tensorflow.org/lite/inference_with_metadata/
        //            lite_support#imageprocessor_architecture
        val imageProcessor =
            ImageProcessor.Builder()
                .build()

        // Preprocess the image and convert it into a TensorImage for classification.
        val tensorImage = imageProcessor.process(TensorImage.fromBitmap(image))
        val imageProcessingOptions = ImageProcessingOptions.builder()
            .setOrientation(getOrientationFromRotation(rotation))
            .build()

        val results = imageClassifier?.classify(tensorImage, imageProcessingOptions)

        return results
/*        return results?.flatMap { classifications ->
            classifications.categories.map { category ->
                Classification {
                    name = category.displayName,
                    score = category.score
                }
            }
        }?.distinctBy {it.name } ?: emptyList()*/
    }

    // Receive the device rotation (Surface.x values range from 0->3) and return EXIF orientation
    // http://jpegclub.org/exif_orientation.html
    private fun getOrientationFromRotation(rotation: Int) : ImageProcessingOptions.Orientation {
        when (rotation) {
            Surface.ROTATION_270 ->
                return ImageProcessingOptions.Orientation.BOTTOM_RIGHT
            Surface.ROTATION_180 ->
                return ImageProcessingOptions.Orientation.RIGHT_BOTTOM
            Surface.ROTATION_90 ->
                return ImageProcessingOptions.Orientation.TOP_LEFT
            else ->
                return ImageProcessingOptions.Orientation.RIGHT_TOP
        }
    }


    interface ClassifierListener {
        fun onError(error: String)
        fun onResults(
            results: List<Classifications>?,
            inferenceTime: Long
        )
    }
}*/