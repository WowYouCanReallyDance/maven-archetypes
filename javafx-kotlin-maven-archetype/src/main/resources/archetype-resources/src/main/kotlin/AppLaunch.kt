package ${package}

import javafx.application.Application
import javafx.event.EventHandler
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Alert
import javafx.scene.control.Button
import javafx.scene.control.PasswordField
import javafx.scene.control.TextField
import javafx.scene.input.MouseEvent
import javafx.scene.layout.Background
import javafx.scene.layout.GridPane
import javafx.scene.layout.VBox
import javafx.scene.paint.Paint
import javafx.stage.Stage

class AppLaunch : Application() {
    override fun start(stage: Stage) {
        val pane = GridPane()
        pane.alignment = Pos.CENTER
        pane.setPrefSize(820.0, 560.0)
        pane.background = Background.fill(Paint.valueOf("#FAEBD7"))
        val row = VBox()
        row.alignment = Pos.CENTER
        row.background = Background.fill(Paint.valueOf("#A69532"))
        val username = TextField()
        username.setPrefSize(320.0, 32.0)
        val password = PasswordField()
        password.setPrefSize(320.0, 32.0)
        val btn1 = Button()
        btn1.setPrefSize(320.0, 46.0)
        btn1.onMouseClicked = EventHandler {
            Alert(Alert.AlertType.CONFIRMATION).show()
        }
        row.children.addAll(username, password, btn1)
        pane.children.add(row)
        val scene = Scene(pane)
        stage.setScene(scene)
        stage.show()
    }

}

fun main() {
    Application.launch(AppLaunch::class.java)
}