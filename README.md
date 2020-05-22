# Descripton:
The goal of the game is to open all the cells of the playing field on which there is no bomb. You will lose if you click on the cell with the bomb. If you are sure that the cell contains a bomb, you can right-click to mark it as a reminder. After you have marked all the bombs around the open cell, you can quickly open the remaining cells that are not bombs by clicking on the cell with the offset.

To help the player avoid getting into a mine, the location of the alleged mine can be marked by right-clicking on it. The game is won, as soon as all empty or numbered squares have been detected by the player, all remaining mines are not marked.

### Class Flag
![image](./classflag/img.jpg)
![image2](./classflag/img2.jpg)
![image3](./classflag/img3.jpg)

### Class Bomb
This is the matrix work with the flag
![image4](./classBomb/img4.jpeg)
![image5](./classBomb/img5.jpeg)

### ClassCoord 
![image7](./classCoord/img7.jpeg)

### ClassBox
![image8](./classBox/img8.jpeg)

### ClassMatrix
![image9](./classMatrix/img9.jpeg)

### ClassGame
![image10](./classGame/img10.jpeg)
![image11](./classGame/img11.jpeg)
![image12](./classGame/img12.jpeg)
![image13](./classGame/img13.jpeg)

###ClassGameState
![image14](./classGameState/img14.jpeg)

### ClassMineSweeper
![image15](./classMineSweeper/img15.jpeg)
![image16](./classMineSweeper/img16.jpeg)
![image17](./classMineSweeper/img17.jpeg)
![image18](./classMineSweeper/img18.jpeg)
![image19](./classMineSweeper/img19.jpeg)
![image20](./classMineSweeper/img20.jpeg)
![image21](./classMineSweeper/img21.jpeg)
![image22](./classMineSweeper/img22.jpeg)

### ClassSimpleGUIandMain
![image23](./classSimpleGUIandMain/img23.jpeg)
![image24](./classSimpleGUIandMain/img24.jpeg)
![image25](./classSimpleGUIandMain/img25.jpeg)
![image26](./classSimpleGUIandMain/img26.jpeg)
![image27](./classSimpleGUIandMain/img27.jpeg)

### Description for Clases

#### 1) BOX ENUM   
there are all the pictures in order to work with them in enum box an enumeration will be created in which all the pictures of the lower and upper layers with bombs are recorded. Also to enm box need object image which use for display images. Object considered public, to Object can anyone contact it because it was easy to set the value.
We have Two functions getNumber and nextNumberBox
GetNumber – is used to know which number there is.
NextNumberBox – is used when bombs are used, the function also moves from one value to another

#### 2) Class Coord 
We use class Coord to store cell coordinates and work with all of these

#### 3)  Class Game 
in this class are everything we necessary 
Matrix – bomb, flag, gamestate
Сonstructor’s
Void start - game launch method
PressleftButton and  PressRightButton - method for pressing right and left
GettotaoBombs - how many bombs
Flags - how many flags

#### 4) Class Matrix
We use to store in Box.
 In Matrix have top flags and bottom bombs 
Also in Matrix I use constructor which fills the entire matrix in the specified field

#### 5) Class Ranges 
use to store field size
Variable size safe the size
Allcoords – use for to iterate over all elements
Random – use in oder to generate random coordinate 
Also use Set and Get
GetAllCoords -  get the whole list of coordinates
GetCoordAround - get coordinate around any cell
GetRandomCoord – get random coordinates
InRange - function determines which cell is in the field

#### 6) Class Bomb
This is the matrix work with the bomb

#### 7) Class Flag
This is the matrix work with the flag

#### 8) Class GameState
This is a class condition that the game can really show
We have 3 type of conditions
1)	PLAYED
2)	BOMBED
3)	WINNER
