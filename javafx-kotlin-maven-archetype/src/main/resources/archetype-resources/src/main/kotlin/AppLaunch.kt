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
            this.scene = Scene(GridPane().apply {
                this.alignment = Pos.CENTER
                this.setPrefSize(820.0, 560.0)
                this.background = Background.fill(Paint.valueOf("#FAEBD7"))
                this.children.add(VBox().apply {
                    this.alignment = Pos.CENTER
                    this.background = Background.fill(Paint.valueOf("#A69532"))
                    this.children.addAll(
                        TextField().apply {
                            this.setPrefSize(320.0, 32.0)
                        },
                        PasswordField().apply {
                            this.setPrefSize(320.0, 32.0)
                        },
                        Button().apply {
                            this.setPrefSize(320.0, 46.0)
                            this.onMouseClicked = EventHandler {
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