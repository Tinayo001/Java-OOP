class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        } else {
            return 6;
        }
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {

    private boolean spellPrepared = false;  // field to remember if spell is prepared

    public void prepareSpell() {
        spellPrepared = true;  // now wizard remembers that the spell is ready
    }

    @Override
    boolean isVulnerable() {
        return !spellPrepared;  // only vulnerable if spell is NOT prepared
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (spellPrepared) {
            return 12;
        } else {
            return 3;
        }
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}

// TODO: define the Warrior class

// TODO: define the Wizard class
