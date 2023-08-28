package ${package}

import javafx.application.Application
import javafx.event.EventHandler
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Alert
import javafx.scene.control.Button
import javafx.scene.control.PasswordField
import javafx.scene.control.TextField
import javafx.scene.layout.Background
import javafx.scene.layout.GridPane
import javafx.scene.layout.VBox
import javafx.scene.paint.Paint
import javafx.stage.Stage

class AppLaunch : Application() {
    override fun start(stage: Stage) {
        stage.apply {
            scene = Scene(GridPane().apply {
                alignment = Pos.CENTER
                setPrefSize(820.0, 560.0)
                background = Background.fill(Paint.valueOf("#FAEBD7"))
                children.add(VBox().apply {
                    this.spacing = 12.0
                    alignment = Pos.CENTER
//                    background = Background.fill(Paint.valueOf("#A69532"))
                    children.addAll(
                        TextField().apply {
                            setPrefSize(320.0, 46.0)
                            promptText = "Please entry the username:"
                        },
                        PasswordField().apply {
                            setPrefSize(320.0, 46.0)
                            promptText = "Please entry the password:"
                        },
                        Button("Login").apply {
                            setPrefSize(320.0, 46.0)
                            onMouseClicked = EventHandler {
                                Alert(Alert.AlertType.CONFIRMATION).show()
                            }
                        }
                    )
                })
            })
        }.show()
    }
}

fun main() {
    Application.launch(AppLaunch::class.java)
}