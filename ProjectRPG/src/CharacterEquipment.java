public enum CharacterEquipment {
    HAUBERK("hauberk"),
    HELMET("helmet"),
    SHIELD("shield");

    public String getTitle () {
        return title;
    }

    private final String title;

    private CharacterEquipment (String title) {
        this.title=title;
    }
}
