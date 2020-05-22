package sweeper;

class Bomb
{
    private Matrix bobmMap;
    private int totalBombs;

    Bomb(int totalBombs)
    {
        this.totalBombs = totalBombs;
        fixBombsCount();
    }

    void start()
    {
        bobmMap = new Matrix(Box.ZERO);
        for(int j= 0; j < totalBombs; j++)
            placeBomb();
    }

    Box get ( Coord coord)
    {
        return bobmMap.get(coord);
    }

    private void fixBombsCount ()
    {
        int maxBombs = Ranges.getSize().x * Ranges.getSize().y / 2;
        if (totalBombs > maxBombs)
            totalBombs = maxBombs;
    }

    private void placeBomb ()
    {
        while (true)
        {
            Coord coord = Ranges.getRandomCoord();
            if (Box.BOMB == bobmMap.get(coord))
                continue;
            bobmMap.set (coord, Box.BOMB);
            incNumbersAroundBomb(coord);
            break;
        }
    }

    private void incNumbersAroundBomb (Coord coord)
    {
        for (Coord around : Ranges.getCoordsAround(coord))
            if (Box.BOMB != bobmMap.get(around))
            bobmMap.set (around, bobmMap.get(around). getNextNumberBox());
    }

    int getTotalBombs()
    {
        return totalBombs;
    }
}
