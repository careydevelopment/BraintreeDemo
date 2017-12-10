# MongoDBDemo
A demo showing how to integrate MongoDB with Spring Boot.

Keep in mind, you'll need to replace the MongoDB URL in application.properties with your own URL. Also, you'll need a document
structure that includes the following fields: image (a string), category (a string), date (an ISO date), keys (an array).

Additionally, the name of the collection should be "images". If you change it, you'll need to update the @Documentation annotation
in the ChiveImage class.

Just pull this project down in Eclipse, then build it. Once it's built, you can run it from the command line with:
java -jar mongodbdemo-1.0.jar

Alternatively, you can run it within Eclipse by right-clicking on Application and selecting Run As... Java Application.

Once the application is launched, you can access it at http://localhost:8090/
