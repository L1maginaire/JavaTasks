package ThinkingInJava4thEd.i_Inner_classes;

// Modify interfaces/HorrorShow.java to implement DangerousMonster and Vampire using anonymous classes.

public class T_14 {
}

interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster {
    public void menace() {
    }

    public void destroy() {
    }
}

interface Vampire
        extends DangerousMonster, Lethal {
    void drinkBlood();
}

class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static DangerousMonster dangerousMonster() {
        return new DangerousMonster() {
            @Override
            public void destroy() {
                System.out.println("DM.destroy()");
            }

            @Override
            public void menace() {
                System.out.println("DM.menace()");
            }
        };
    }

    static Vampire vamp() {
        return new Vampire() {
            @Override
            public void destroy() {
                System.out.println("Vamp.destroy()");
            }

            @Override
            public void kill() {
                System.out.println("Vamp.kill()");
            }

            @Override
            public void menace() {
                System.out.println("Vamp.destroy()");
            }

            @Override
            public void drinkBlood() {
                System.out.println("Vamp.drink()");
            }
        };
    }

    public static void main(String[] args) {
        vamp().menace();
        vamp().kill();
        vamp().drinkBlood();
        vamp().destroy();
        dangerousMonster().destroy();
        dangerousMonster().menace();
    }
}