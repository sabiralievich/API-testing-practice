package gb.backendtestingautomation.practice.dto.response;import com.fasterxml.jackson.annotation.JsonProperty;public class ResourseData {/*                "id": 1,                        "name": "cerulean",                        "year": 2000,                        "color": "#98B2D1",                        "pantone_value": "15-4020"*/    @JsonProperty("id")    private Integer id;    @JsonProperty("name")    private String name;    @JsonProperty("year")    private Integer year;    @JsonProperty("color")    private String color;    @JsonProperty("pantone_value")    private String pantoneValue;    public ResourseData() {}    public ResourseData(Integer id, String name, Integer year, String color, String pantoneValue) {        super();        this.id = id;        this.name = name;        this.year = year;        this.color = color;        this.pantoneValue = pantoneValue;    }    @JsonProperty("id")    public Integer getId() {        return id;    }    @JsonProperty("id")    public void setId(Integer id) {        this.id = id;    }    @JsonProperty("name")    public String getName() {        return name;    }    @JsonProperty("name")    public void setName(String name) {        this.name = name;    }    @JsonProperty("year")    public Integer getYear() {        return year;    }    @JsonProperty("year")    public void setYear(Integer year) {        this.year = year;    }    @JsonProperty("color")    public String getColor() {        return color;    }    @JsonProperty("color")    public void setColor(String color) {        this.color = color;    }    @JsonProperty("pantone_value")    public String getPantoneValue() {        return pantoneValue;    }    @JsonProperty("pantone_value")    public void setPantoneValue(String pantoneValue) {        this.pantoneValue = pantoneValue;    }}