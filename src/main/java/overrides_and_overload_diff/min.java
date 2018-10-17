package overrides_and_overload_diff;

public class Min extends Person{
    private String sex;
    //overload
    public Min(){
        sex="female";
    }
    //overload
    public Min(String sex) {
        this.sex = sex;
    }

    //override
    @Override
    public String introdution() {
        return sex;
    }

}
