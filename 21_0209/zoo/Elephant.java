package zoo;

class Elephant {
    private String name;
    private int satietyLevel = 20;

    public Elephant() {
        this(null);
    }

    public Elephant(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public int getSatietyLevel() {
        return this.satietyLevel;
    }

    public void feeding(int feed) {
        if (feed < 0) {
            System.out.println("무엇을 먹이겠다는 것이오😫!");
        } else if (20 < feed) {
            System.out.println("먹이는 한 번에 20kg 이상 줄 수 없어요!");
        } else if (satietyLevel < 100) {
            satietyLevel += feed;
            if (100 < satietyLevel) {
                satietyLevel = 100;
            }
        } else {
            System.out.println("이미 배가 빵빵해요.");
        }
    }
    

}
