package com.chan.myapplication.repositori

import com.chan.myapplication.apiservice.ServiceApiSiswa
import com.chan.myapplication.modeldata.DataSiswa

interface RepositoryDataSiswa {
    suspend fun getDataSiswa(): List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa): retrofit2.Response<Void>
}

