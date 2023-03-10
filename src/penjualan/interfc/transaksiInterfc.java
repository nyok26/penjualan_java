/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan.interfc;

import java.sql.SQLException;
import penjualan.entity.transaksi;
/**
 *
 * @author SMKN 4 Bandung
 */
public interface transaksiInterfc {
    transaksi insert (transaksi o) throws SQLException;
}
