class Faculty {
    private String name;
    private String specialization;

    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Faculty{Name='" + name + "', Specialization='" + specialization + "'}";
    }
}