import java.awt.Color;

/**
 * @brief This class is used for associating the tile color with the tile value.  It uses getter and setter methods
 * to allow that color and value to be used outside the class, as well as passing those values to the board
 * so the board can be repainted with updated values when tiles are added
 *
 * @Allison Tesh, @Hanna Vaidya, @Alexandra Zolman
 */

//what is the get color function for at bottom

public class Tile
{
    int value; //value on tile
    Color tileColor; //color of tile


    public Tile()
    {
        value = 0; // plain tile, no value
    }

    public Tile(int num)
    {
        value = num; //assigns a tile a value based on num
    }

    public int getValue()
    {
        return value; //allows value to be accessed outside the class
    }

    public void setValue( int value )
    {
        this.value = value; //sets new tile's value when tiles are added
    }


    public void setColor() //basically is a list of what color each value of tile should recieve, ranging from pink to blue as numbers increase
    {
        if (value == 2 )
        {
            tileColor = new Color( 238, 228, 238 ); //color starts as a baby pink for tiles with value 2
        }

        else if (value == 4)
        {
            tileColor = new Color( 250, 224, 250 ); // slightly darker pink
        }
        else if (value == 8)
        {
            tileColor = new Color( 250, 190, 200 ); // light pink
        }
        else if (value == 16)
        {
            tileColor = new Color( 246, 160, 200 ); // regular pink
        }
        else if (value == 32)
        {
            tileColor = new Color( 246, 124, 200 ); // hot pink
        }
        else if (value == 64)
        {
            tileColor = new Color( 246, 0, 200 ); // magenta
        }
        else if (value == 128)
        {
            tileColor = new Color(120, 150, 250); // violet
        }
        else if (value == 256 )
        {
            tileColor = new Color( 50, 120, 250 ); // indigo
        }
        else if (value == 512 )
        {
            tileColor = new Color( 20, 150, 250 ); // blue
        }
        else if (value == 1024 )
        {
            tileColor = new Color( 20, 200, 250 ); // turquoise
        }
        else
        {
            tileColor = new Color( 20, 250, 250 ); // lighter turquoise
        }
    }


    public Color getColor() // returns color
    {
        this.setColor();
        return tileColor;
    }
}