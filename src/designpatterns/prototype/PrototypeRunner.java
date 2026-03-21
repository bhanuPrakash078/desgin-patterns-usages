package designpatterns.prototype;

import designpatterns.prototype.pojos.*;

public class PrototypeRunner {

    public static void main(String[] args) {

        //First time it will get initialised teh objects.
        PrototypeMazeFactory mazeFactory = new PrototypeMazeFactory(new Maze(), new Wall(), new Room(), new Door());
        mazeFactory.createMaze();

        //Second time it will get initialised the custom objects. We are reusing the MazeFactory
        //Instead of creating one more Maze Factory. This is just one more way of creating Objects.
        PrototypeMazeFactory enchantedMazeFactory = new PrototypeMazeFactory(new Maze(), new BrickWall(), new Room(), new EnchantedDoor());
        enchantedMazeFactory.createMaze();

    }
}
