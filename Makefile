build:
	javac sol/*.java -d classes

run:
	java -cp ./classes/ sol.Sol

build-fx:
	javac -cp /usr/lib/jvm/javafx-sdk-11.0.2/lib/src.zip:/usr/lib/jvm/javafx-sdk-11.0.2/lib/javafx-swt.jar:/usr/lib/jvm/javafx-sdk-11.0.2/lib/javafx.web.jar:/usr/lib/jvm/javafx-sdk-11.0.2/lib/javafx.base.jar:/usr/lib/jvm/javafx-sdk-11.0.2/lib/javafx.fxml.jar:/usr/lib/jvm/javafx-sdk-11.0.2/lib/javafx.media.jar:/usr/lib/jvm/javafx-sdk-11.0.2/lib/javafx.swing.jar:/usr/lib/jvm/javafx-sdk-11.0.2/lib/javafx.controls.jar:/usr/lib/jvm/javafx-sdk-11.0.2/lib/javafx.graphics.jar ./sol/*.java -d classes

run-fx:
	java -cp ./classes/:/usr/lib/jvm/javafx-sdk-11.0.2/lib/src.zip:/usr/lib/jvm/javafx-sdk-11.0.2/lib/javafx-swt.jar:/usr/lib/jvm/javafx-sdk-11.0.2/lib/javafx.web.jar:/usr/lib/jvm/javafx-sdk-11.0.2/lib/javafx.base.jar:/usr/lib/jvm/javafx-sdk-11.0.2/lib/javafx.fxml.jar:/usr/lib/jvm/javafx-sdk-11.0.2/lib/javafx.media.jar:/usr/lib/jvm/javafx-sdk-11.0.2/lib/javafx.swing.jar:/usr/lib/jvm/javafx-sdk-11.0.2/lib/javafx.controls.jar:/usr/lib/jvm/javafx-sdk-11.0.2/lib/javafx.graphics.jar sol.Sol

sol:
	make build && make run

sol-fx:
	make build-fx && make run-fx