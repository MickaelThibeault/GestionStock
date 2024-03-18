package com.stock.gestionstock.dto;

import com.stock.gestionstock.model.MvtStock;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtStockDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private ArticleDto article;

    private Integer idEntreprise;

    public static MvtStockDto fromEntity(MvtStock mvtStk) {
        if (mvtStk == null) {
            return null;
        }

        return MvtStockDto.builder()
                .id(mvtStk.getId())
                .dateMvt(mvtStk.getDateMvt())
                .quantite(mvtStk.getQuantite())
                .article(ArticleDto.fromEntity(mvtStk.getArticle()))
                .idEntreprise(mvtStk.getIdEntreprise())
                .build();
    }

    public static MvtStock toEntity(MvtStockDto dto) {
        if (dto == null) {
            return null;
        }

        MvtStock mvtStk = new MvtStock();
        mvtStk.setId(dto.getId());
        mvtStk.setDateMvt(dto.getDateMvt());
        mvtStk.setQuantite(dto.getQuantite());
        mvtStk.setArticle(ArticleDto.toEntity(dto.getArticle()));
        mvtStk.setIdEntreprise(dto.getIdEntreprise());
        return mvtStk;
    }
}
