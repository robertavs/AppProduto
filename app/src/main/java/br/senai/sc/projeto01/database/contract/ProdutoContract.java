package br.senai.sc.projeto01.database.contract;

import br.senai.sc.projeto01.database.entity.ProdutoEntity;

public final class ProdutoContract {

    private ProdutoContract() {}

    public static final String criarTabela() {
        String sql = "CREATE TABLE " + ProdutoEntity.TABLE_NAME + "(" +
                ProdutoEntity._ID +  " INTEGER PRIMARY KEY," +
                ProdutoEntity.COLUMN_NAME_NOME + " TEXT," +
                ProdutoEntity.COLUMN_NAME_VALOR + " REAL)";
        return sql;
    }

    public static final String removerTabela() {
        return "DROP TABLE IF EXISTS " + ProdutoEntity.TABLE_NAME;
    }
}
