package com.nf511.flower.service.Impl;

import com.nf511.flower.dao.AddressDao;
import com.nf511.flower.entity.Address;
import com.nf511.flower.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressImpl implements AddressService {

    @Autowired
    AddressDao addressDao;

    public List<Address> selectAllAddress(int userId) {
        return addressDao.selectAllAddress(userId);
    }

    public Address selectAddressId(int addressId) {
        return addressDao.selectAddressId(addressId);
    }

    public List<Address> selectAllAddressByPage(int pagelimit, int size) {
        return addressDao.selectAllAddressByPage(pagelimit, size);
    }

    public int insertAddress(Address address) {
        return addressDao.insertAddress(address);
    }

    public int updateAddress(Address address) {
        return addressDao.updateAddress(address);
    }

    public int deleteAddress(int addressId) {
        return addressDao.deleteAddress(addressId);
    }

    public int deleteAll(List<Integer> items) {
        return addressDao.deleteAll(items);
    }
}
