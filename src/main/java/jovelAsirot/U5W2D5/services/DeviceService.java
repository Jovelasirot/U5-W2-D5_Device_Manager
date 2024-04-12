package jovelAsirot.U5W2D5.services;

import jovelAsirot.U5W2D5.entities.Device;
import jovelAsirot.U5W2D5.exceptions.NotFoundException;
import jovelAsirot.U5W2D5.payloads.DeviceDTO;
import jovelAsirot.U5W2D5.repositories.DeviceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {

    @Autowired
    private DeviceDAO dDAO;

    public Page<Device> getAll(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));

        return this.dDAO.findAll(pageable);
    }

    public Device save(DeviceDTO payload) {
        Device newDevice = new Device(payload.type(), payload.status());

        return dDAO.save(newDevice);
    }

    public Device findById(Long deviceId) {

        return this.dDAO.findById(deviceId).orElseThrow(() -> new NotFoundException(deviceId));
    }

    public Device updateById(Long deviceId, Device updatedDevice) {
        Device deviceFound = this.findById(deviceId);

        deviceFound.setType(updatedDevice.getType());
        deviceFound.setStatus(updatedDevice.getStatus());
        deviceFound.setEmployee(updatedDevice.getEmployee());

        return this.dDAO.save(deviceFound);
    }

    public void deleteById(Long deviceId) {
        Device deviceFound = this.findById(deviceId);

        this.dDAO.delete(deviceFound);
    }

}
