package com.example.service;

import com.example.grpc.Client;
import com.example.grpc.ShopServiceGrpc;
import com.google.protobuf.Descriptors;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ShopServiceClient {

    @GrpcClient("grpc-prob-service")
    ShopServiceGrpc.ShopServiceBlockingStub stub;

    public Map<Descriptors.FieldDescriptor, Object> getClient(int clientId){
        Client clientRequest = Client.newBuilder().setClientId(clientId).build();
        Client clientResponse = stub.getClient(clientRequest);
        return clientResponse.getAllFields();
    }
}
