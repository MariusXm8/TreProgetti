package srl.anagrafica.demo.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProgettoDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-14T17:27:51.223137400+01:00[Europe/Paris]")
public class ProgettoDTO   {
  @JsonProperty("listaLavoratori")
  @Valid
  private List<Integer> listaLavoratori = null;

  @JsonProperty("dataInizio")
  private String dataInizio;

  @JsonProperty("dataFine")
  private String dataFine;

  @JsonProperty("budget")
  private Float budget;

  public ProgettoDTO listaLavoratori(List<Integer> listaLavoratori) {
    this.listaLavoratori = listaLavoratori;
    return this;
  }

  public ProgettoDTO addListaLavoratoriItem(Integer listaLavoratoriItem) {
    if (this.listaLavoratori == null) {
      this.listaLavoratori = new ArrayList<>();
    }
    this.listaLavoratori.add(listaLavoratoriItem);
    return this;
  }

  /**
   * Get listaLavoratori
   * @return listaLavoratori
  */
  @ApiModelProperty(example = "[1,2,3]", value = "")


  public List<Integer> getListaLavoratori() {
    return listaLavoratori;
  }

  public void setListaLavoratori(List<Integer> listaLavoratori) {
    this.listaLavoratori = listaLavoratori;
  }

  public ProgettoDTO dataInizio(String dataInizio) {
    this.dataInizio = dataInizio;
    return this;
  }

  /**
   * Get dataInizio
   * @return dataInizio
  */
  @ApiModelProperty(example = "2011-12-03", value = "")


  public String getDataInizio() {
    return dataInizio;
  }

  public void setDataInizio(String dataInizio) {
    this.dataInizio = dataInizio;
  }

  public ProgettoDTO dataFine(String dataFine) {
    this.dataFine = dataFine;
    return this;
  }

  /**
   * Get dataFine
   * @return dataFine
  */
  @ApiModelProperty(example = "2011-12-03", value = "")


  public String getDataFine() {
    return dataFine;
  }

  public void setDataFine(String dataFine) {
    this.dataFine = dataFine;
  }

  public ProgettoDTO budget(Float budget) {
    this.budget = budget;
    return this;
  }

  /**
   * Get budget
   * @return budget
  */
  @ApiModelProperty(example = "500.0", value = "")


  public Float getBudget() {
    return budget;
  }

  public void setBudget(Float budget) {
    this.budget = budget;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgettoDTO progettoDTO = (ProgettoDTO) o;
    return Objects.equals(this.listaLavoratori, progettoDTO.listaLavoratori) &&
        Objects.equals(this.dataInizio, progettoDTO.dataInizio) &&
        Objects.equals(this.dataFine, progettoDTO.dataFine) &&
        Objects.equals(this.budget, progettoDTO.budget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listaLavoratori, dataInizio, dataFine, budget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgettoDTO {\n");
    
    sb.append("    listaLavoratori: ").append(toIndentedString(listaLavoratori)).append("\n");
    sb.append("    dataInizio: ").append(toIndentedString(dataInizio)).append("\n");
    sb.append("    dataFine: ").append(toIndentedString(dataFine)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

