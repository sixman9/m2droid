# m2droid - Maven Android Plugin example project

What to write? - this is my first OSS project!

Well, the hope is that this project will get a potential Android dev up 
and coding apps as painlessly as possible (remember I said 'hopefully').

The App contains some very basic (and fairly useless) code, but hey, it shows
you how to access and "design" Views etc.

This [Maven][maven] project is based on the [Maven Android Plugin][maven-android-plugin].

Please install the [Android SDK][google-android-sdk] then point an environment variable names 
'ANDROID_HOME' at its top-level directory (i.e. ANDROID_HOME=/path/to/A-SDK).

Commands:

# Eclipse project files (or pom.xml import - [m2eclipse-plugin][m2eclipse] or in Netbeans)
	mvn eclipse:eclipse

# Tidy up
	mvn clean

# Compile the .apk file etc.
	mvn package

#Install and start emulator
	mvn android:emulator-start
 
#Deploy to attached device 
	mvn android:deploy

Or combine the above:

	mvn clean package android:deploy

Don't forget to either name an emulator 'em22' or change the pom.xml accordingly.

[google-android-sdk]: http://developer.android.com/sdk/installing.html
[google-eclipse-adt-plugin]: http://developer.android.com/sdk/eclipse-adt.html 
[m2eclipse]: http://m2eclipse.sonatype.org/installing-m2eclipse.html
[maven-android-plugin]: http://code.google.com/p/maven-android-plugin/
[m2e-android-integration]: http://code.google.com/a/eclipselabs.org/p/m2eclipse-android-integration/
[maven]: http://maven.apache.org/

P.S. Why use Maven? Maven is great for distributing projects and getting a quick
footing, I've found it slightly difficult to configure within complex projects it hasn't been as 
'flexible' as Apache Ant IMHO. Have a look at Maven and Ant together (for 
Maven library/dependency management within Ant) at 
http://ptrthomas.wordpress.com/2009/03/08/why-you-should-use-the-maven-ant-tasks-instead-of-maven-or-ivy/. 

BTW Maven 3 will have programmatic configuration via a number of languages, so maybe that advance level things ;-) .

I'd like to thank [Wakaleo Training](http://www.wakaleo.com/blog/302-android-development-with-maven/ "Android development with Maven") for their excellent Android with Maven tutorial(s).
