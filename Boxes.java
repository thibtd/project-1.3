
import javafx.scene.PointLight;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Group;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.stage.Stage;
import javafx.scene.shape.DrawMode;




public class Boxes extends Application

{
    public static void main(String[] args)

    {

        Application.launch(args);

    }


      @Override
      public void start(Stage stage) throws Exception{

        // create the boxes
        Box box1 = new Box(100, 100, 100);
        box1.setTranslateX(100);
        box1.setTranslateY(225);
        box1.setTranslateZ(200);
        box1.setMaterial(new PhongMaterial(Color.BLACK));


        Box box2 = new Box(100, 100, 100);
        box2.setTranslateX(100);
        box2.setTranslateY(125);
        box2.setTranslateZ(200);
        box2.setMaterial(new PhongMaterial(Color.YELLOW));

        Box box3 = new Box(100, 100, 100);
        box3.setTranslateX(200);
        box3.setTranslateY(225);
        box3.setTranslateZ(200);
        box3.setMaterial(new PhongMaterial(Color.RED));

        Box truck = new Box(400,250,200);
        truck.setTranslateX(250);
        truck.setTranslateY(150);
        truck.setTranslateZ(100);
        truck.setDrawMode(DrawMode.LINE);

        // create a light
        PointLight light = new PointLight();
        light.setTranslateX(350);
        light.setTranslateY(100);
        light.setTranslateZ(100);


        // Create a Camera + position

        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.setTranslateX(100);
        camera.setTranslateY(500);
        camera.setTranslateZ(250);



        //  scene graph
        Group root = new Group(box1, box2, box3, truck, light,camera);
        Scene scene = new Scene(root, 700, 400, true);
        stage.setScene(scene);

        // Set the Title of the Stage
        stage.setTitle("Cubes");

        // Display the Stage
        stage.show();

    }


}
