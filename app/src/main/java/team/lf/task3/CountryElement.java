package team.lf.task3;

public class CountryElement {
    private String ivUrl;
    private String tvTittle;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CountryElement(String ivUrl, String tvTittle, String description) {
        this.ivUrl = ivUrl;
        this.tvTittle = tvTittle;
        this.description = description;
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