package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Box;

/**
 * test
 * @author normenhansen
 */
public class Main extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        Box b = new Box(1, 1, 1);
        Geometry blue = new Geometry("Box", b);
        blue.setLocalTranslation(new Vector3f(1,-1,1));
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Blue);
        blue.setMaterial(mat);

        Box b2 = new Box(1,1,1);
        Geometry red = new Geometry("Box", b2);
        red.setLocalTranslation(new Vector3f(1,3,1));
        
        Material mat2 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat2.setColor("Color", ColorRGBA.Red);
        red.setMaterial(mat2);
        
        /** Create a pivot node at (0,0,0) and attach it to the root node */
        Node pivot = new Node("pivot");
        rootNode.attachChild(pivot); // put this node in the scene
 
        /** Attach the two boxes to the *pivot* node. (And transitively to the root node.) */
        pivot.attachChild(blue);
        pivot.attachChild(red);
        /** Rotate the pivot node: Note that both boxes have rotated! */
        pivot.rotate(.4f,.4f,0f);
        
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
