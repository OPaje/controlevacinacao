package web.controlevacinacao.repository.queries.vacina;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import web.controlevacinacao.model.Vacina;
import web.controlevacinacao.model.filter.VacinaFilter;

public interface VacinaQueries {

    Page<Vacina> buscarComFiltro(VacinaFilter filtro, Pageable pageable);
    
}
