package team.lf.task3;

public class CountryElement {
    private String ivUrl;
    private String tvTittle;

    public CountryElement(String ivUrl, String tvTittle) {
        this.ivUrl = ivUrl;
        this.tvTittle = tvTittle;
    }

    public String getTvTittle() {
        return tvTittle;
    }

    public void setTvTittle(String tvTittle) {
        this.tvTittle = tvTittle;
    }

    public String getIvUrl() {
        return ivUrl;
    }

    public void setIvUrl(String ivUrl) {
        this.ivUrl = ivUrl;
    }
}