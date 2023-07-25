# Mohar - The image saviour

[![Download from Play Store](https://img.shields.io/badge/Download%20on-Google%20Play-brightgreen.svg)](https://play.google.com/store/apps/details?id=me.enginestein.mohar)

Mohar is not just an ordinary watermarking app; it's a powerful tool designed to safeguard your images with a plethora of customizable features for adding watermarks. With Mohar, your images are shielded with an extra layer of protection, ensuring that your creative work remains uniquely yours.

What sets Mohar apart from the rest is its extensive range of advanced functionalities. Whether you want to add text-based watermarks, logos, or intricate designs, Mohar empowers you to do so effortlessly. You have complete control over the size, position, transparency, and style of your watermarks, allowing you to achieve the perfect blend of protection and aesthetic appeal.

Moreover, the best part about Mohar is that it comes absolutely free of charge, making it an ideal choice for both amateur photographers and professionals alike. You no longer need to worry about investing in expensive watermarking software; Mohar provides a top-tier solution without costing you a penny.

Preserving your intellectual property and preventing unauthorized use of your images has never been easier. With Mohar by your side, you can confidently share your work online, knowing that your creativity is safeguarded from misuse. Experience the seamless integration of security and artistry with Mohar - the ultimate watermarking app.

# Mohar SDK

We have created a library to add watermarks to images using Kotlin.

## Installation

Add the following lines to your `build.gradle` file:

```gradle
dependencies {
    implementation 'com.github.enginestein:Mohar-SDK:1.0.0'
}

allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

## Usage

To use the SDK, you need to perform the following steps:

1. Specify the activity from which you want to show the watermark (`AppCompatActivity`). This is mandatory.
2. Set the layout resource that you want to use as the watermark. This is mandatory.
3. Optionally, you can specify a background color for the watermark. If omitted, the background color of your defined layout resource will be used.
4. Optionally, you can set the opacity of the background color. The default opacity is 50, but it is advised not to set it above 80 to avoid interfering with the main UI or content visibility.

### Java

```java
AppWaterMarkBuilder.doConfigure()
    .setAppCompatActivity(MainActivity.this)
    .setWatermarkProperty(R.layout.layout_water_mark)
    // You can also set opacity or opacity with a default background color.
    // Just call like that ".setWatermarkProperty(R.layout.layout_water_mark, 40, R.color.colorAccent)"
    .showAlsoOutsideOfTheApp() // Optional: Call it if you want to show the watermark globally over other apps.
    .showWatermarkAfterConfig(new WatermarkListener() { // This callback is also optional.
        @Override
        public void onSuccess() {
            Log.d(TAG, "Successfully showing watermark");
        }

        @Override
        public void onFailure(String message, Throwable throwable) {
            Log.d(TAG, "Failed: " + message);
        }

        @Override
        public void showLog(String log, @Nullable Throwable throwable) {
            Log.d(TAG, "Log: " + log);
        }
    });

// Then you can hide and show the watermark from anywhere in your app.

// For hiding the watermark without a callback
AppWaterMarkBuilder.hideWatermark();

// For hiding the watermark with a callback
AppWaterMarkBuilder.hideWatermark(new WatermarkListener() {
    @Override
    public void onSuccess() {
        Log.d(TAG, "Successfully hiding watermark");
    }

    @Override
    public void onFailure(String message, Throwable throwable) {
        Log.d(TAG, "Failed: " + message);
    }

    @Override
    public void showLog(String log, @Nullable Throwable throwable) {
        Log.d(TAG, "Log: " + log);
    }
});

// For showing the watermark without a callback
AppWaterMarkBuilder.showWatermark();

// For showing the watermark with a callback
AppWaterMarkBuilder.showWatermark(new WatermarkListener() {
    @Override
    public void onSuccess() {
        Log.d(TAG, "Successfully showing watermark");
    }

    @Override
    public void onFailure(String message, Throwable throwable) {
        Log.d(TAG, "Failed: " + message);
    }

    @Override
    public void showLog(String log, @Nullable Throwable throwable) {
        Log.d(TAG, "Log: " + log);
    }
});
```

### Kotlin

```kotlin
doConfigure()
    .setAppCompatActivity(this@MainActivity)
    .setWatermarkProperty(R.layout.layout_water_mark)
    // You can also set opacity or opacity with a default background color.
    // Just call like that ".setWatermarkProperty(R.layout.layout_water_mark, 40, R.color.colorAccent)"
    .showWatermarkAfterConfig(object : WatermarkListener { // This callback is also optional.
        override fun onSuccess() {
            Log.d(TAG, "Successfully showing watermark")
        }

        override fun onFailure(message: String?, throwable: Throwable?) {
            Log.d(TAG, "Failed: $message")
        }

        override fun showLog(log: String?, throwable: Throwable?) {
            Log.d(TAG, "Log: $log")
        }
    })

// Then you can hide and show the watermark from anywhere in your app.

// For hiding the watermark without a callback
AppWaterMarkBuilder.hideWatermark()

// For hiding the watermark with a callback
AppWaterMarkBuilder.hideWatermark(object : WatermarkListener {
    override fun onSuccess() {
        Log.d(TAG, "Successfully hiding watermark")
    }

    override fun onFailure(message: String?, throwable: Throwable?) {
        Log.d(TAG, "Failed: $message")
    }

    override fun showLog(log: String?, throwable: Throwable?) {
        Log.d(TAG, "Log: $log")
    }
})

// For showing the watermark without a callback
AppWaterMarkBuilder.showWatermark()

// For showing the watermark with a callback
AppWaterMarkBuilder.showWatermark(object : WatermarkListener {
    override fun onSuccess() {
        Log.d(TAG, "Successfully showing watermark")
    }

    override fun onFailure(message: String?, throwable: Throwable?) {
        Log.d(TAG, "Failed: $message")
    }

    override fun showLog(log: String?, throwable: Throwable?) {
        Log.d(TAG, "Log: $log")
    }
})
```

In the code snippets, I have removed the comments to make the code more concise and readable while preserving its functionality.

<h1 align="center">Privacy Policy</h1>

The Privacy Policy respects and protects the individual privacy of all users of the Privacy Policy
Web Services. In order to provide you with a more accurate and personalized service, our Privacy
Policy covers the ways in which we collect, use, disclose, transmit and store your information.
However, the Privacy Policy will treat this information with a high degree of diligence and duty of
care. We may update this Privacy Policy from time to time. By agreeing to the Privacy Policy Network
Services Usage Agreement, you agree to this Privacy Policy in its entirety. This Privacy Policy is
an integral part of the Privacy Policy Network Service Use Agreement. You do not have to provide us
with the personal information we request, but in many cases, if you choose not to do so, we will not
be able to provide you with our products or services or respond to any questions you may have. If
you have any questions about the data processing practices described in this Privacy Policy, please
contact us at [aryavartcreations@outlook.com](mailto:aryavartcreations@outlook.com) so that we can address your specific needs. We are
happy to receive your feedback.

<h3> I. How we collect information</h3>
We don't actively collect information at all. Even without your information, we're still running just fine. Of course, if it crashes, you have the option of sending us an email with the device model and system version information so that we can locate the problem.

<h3> II. How we use the information we collect</h3>
We don't collect information voluntarily at all. But if, after a crash, you voluntarily send us information about your device, we will use it to locate and resolve your crash, not for any other purpose.

<h3> Third, how we share, transfer, and publicly disclose your personal information</h3>
We don't actively collect information at all. And no personal information about you, so don't worry.
But if, after a crash, you actively send us information about your device, we'll use it for nothing more than locating and resolving your crash (which may appear in Git commits, logs, or GitHub-related issues).

<h3> 4. How we protect your personal information</h3>
We don't actively collect information at all. And no personal information about you to worry about. We don't want, need or want to help you protect it.

<h3> V. How you manage your personal information</h3>
We don't actively collect information at all. And no personal information about you that you don't need or want to manage.

<h3> VI. How this policy is updated</h3>
Our Privacy Policy will be updated from time to time.
In general, we will not reduce your entitlement under this Privacy Policy.
Yes Rights. We will post the updated version on this page and
Notify you of what this policy does by means of a bullet box or in a manner as conspicuous as the bullet box
Any changes, by your consent, you agree to be bound by this policy as amended
The constraints.
<h3>Vii. How to contact us</h3>
If you have any questions, comments or suggestions regarding this Privacy Policy, you may
Contact us by email: aryavartcreations@outlook.com If you are not satisfied with our response, especially with our personal information
You may also be able to address your legal rights by filing a complaint with us.
Seeking resolution by filing a lawsuit in the people's court of competent jurisdiction
Program.
