package com.driver.services;

import com.driver.model.Admin;
import com.driver.model.ServiceProvider;

public interface AdminService {
    public Admin register(String username, String password);
    public Admin addServiceProvider(Integer adminId, String providerName) ;
    public ServiceProvider addCountry(Integer serviceProviderId, String countryName) throws Exception;

}