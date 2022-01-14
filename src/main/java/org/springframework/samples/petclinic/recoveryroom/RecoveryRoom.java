package org.springframework.samples.petclinic.recoveryroom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.model.NamedEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "recovery_rooms")
public class RecoveryRoom extends BaseEntity {
//    Integer id;
	@Column(name="name")
	@Size(min = 3, max = 50)
	@NotBlank
    private String name;
	
	@Column(name="size")
	@Min(0)
	@NotNull
    private double size;
	
	@NotNull
	@Column(name="secure")
	private boolean secure;
	
   // @Transient
    @ManyToOne
    @NotNull
	@JoinColumn(name ="room_Types")
    RecoveryRoomType roomType;
}
