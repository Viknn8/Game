class Drawing {
    private final String[] stages = {
            """
           ------
           |
           |
           |
           |
           |
        ---------
        """,//1 ошибка
            """
           ------
           |    |
            |
            |
            |
            |
        ---------
        """,//2 ошибка
            """
           ------
           |    |
           |    O
           |
           |
           |
        ---------
        """,//3 ошибка
            """
           ------
           |    |
           |    O
           |    |
           |
           |
        ---------
        """,//4 ошибка
            """
           ------
           |    |
           |    O
           |   /|
           |
           |
        ---------
        """,//5 ошибка
            """
           ------
           |    |
           |    O
           |   /|\\
           |
           |
        ---------
        """,//6 ошибка
            """
           ------
           |    |
           |    O
           |   /|\\
           |   /
           |
        ---------
        """
    };//7 ошибка

    public void human(int remainingAttempts) {
        int you = stages.length - remainingAttempts;
        if (you >= 0 && you < stages.length) {
            System.out.println(stages[you]);
        }
    }
}
