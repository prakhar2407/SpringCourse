package SetterInjection;

public class CricketCoach implements Coach{
    private IFortune ifortune;

    @Override
    public String getDailyWorkout(){
        return "practise 30 hrs daily";
    }

    public IFortune getiFortune(){
        return ifortune;
    }

    public void setIfortune(IFortune ifortune){
        System.out.println("CricketCoach : inside setter method - setFortuneService");
        this.ifortune = ifortune;
    }

    public String getDailyFortune(){
        return ifortune.getFortune();
    }
}
