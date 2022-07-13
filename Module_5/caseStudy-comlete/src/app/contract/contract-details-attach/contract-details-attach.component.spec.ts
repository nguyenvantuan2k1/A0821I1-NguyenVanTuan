import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ContractDetailsAttachComponent } from './contract-details-attach.component';

describe('ContractDetailsAttachComponent', () => {
  let component: ContractDetailsAttachComponent;
  let fixture: ComponentFixture<ContractDetailsAttachComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ContractDetailsAttachComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ContractDetailsAttachComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
