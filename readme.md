# Zero


To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	         implementation 'com.github.rajendrarajaram:zero:v1.1'
	}
[![](https://jitpack.io/v/rajendrarajaram/zero.svg)](https://jitpack.io/#rajendrarajaram/zero)


This library have two improtant Views Called **TimeTextView** and **DateTextView**
Let discuss how to use them : 

**TimeTextView**

```xml
<io.github.rajendrarajaram.zero.TimeTextView
        android:padding="10dp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
```

TimeTextView will show the current time according to current time format of mobile that is 12 or 24 hour. 
Any one can use the **time-stamp** coming from the server.

```xml 
<io.github.rajendrarajaram.zero.TimeTextView
        android:id="@+id/show_date"
        android:layout_width="wrap_content"
        android:padding="10dp"
        app:dateformat="@string/date_format"
        android:layout_height="wrap_content" />
   ```

```xml
 <string name="date_format">yyyy-MM-DD HH:mm:ss</string>
```

```java
   public class MainActivity extends AppCompatActivity {
       
    TimeTextView timeTextView;
    DateTextView dateTextView;
    
       @Override
       protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
   
           setContentView(R.layout.activity_main);
           timeTextView = findViewById(R.id.show_time);
           dateTextView  = findViewById(R.id.show_date);
           timeTextView.setDate("2010-05-30 22:15:52");
          dateTextView.setDate("2010-05-30 22:15:52");
   
       }
   }
````

DateTimeView is same as TimeTextView