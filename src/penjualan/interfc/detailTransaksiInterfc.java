/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan.interfc;

import java.sql.SQLException;
import penjualan.entity.detailTransaksi;

/**
 *
 * @author SMKN 4 Bandung
 */
public interface detailTransaksiInterfc {
      detailTransaksi insert (detailTransaksi o) throws SQLException;
}
