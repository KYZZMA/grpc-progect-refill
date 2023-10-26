package com.example.service;

import com.example.entity.ShopDB;
import com.example.grpc.Client;
import com.example.grpc.ShopServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ShopService extends ShopServiceGrpc.ShopServiceImplBase {

    @Override
    public void getClient(Client request, StreamObserver<Client> responseObserver) {
        ShopDB.getClientsFromDb().stream()
                .filter(client -> client.getClientId() == request.getClientId())
                .findFirst()
                .ifPresent(responseObserver::onNext);
        responseObserver.onCompleted();
    }
}
