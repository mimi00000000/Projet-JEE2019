package org.Metier;

import java.util.List;

import org.entities.Risque;
import org.springframework.stereotype.Component;


@Component
public interface RisqueMetier {
	public Risque saveRisque(Risque risque);
	public List<Risque> listRisques();
	public Risque getRisqueByCode(String nomRisque);
}
