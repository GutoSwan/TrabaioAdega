package adega.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "bottle")
public class BottleModel {

    @Id
    public Integer code;
    @Column(nullable = false,length = 20)
    public String model;
    @Column(nullable = false,length = 20)
    public String liquid;
    @Column(nullable = false,length = 20)
    public String volume;
    @Column
    public Float price;
}
