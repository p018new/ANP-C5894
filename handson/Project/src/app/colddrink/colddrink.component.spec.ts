import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ColddrinkComponent } from './colddrink.component';

describe('ColddrinkComponent', () => {
  let component: ColddrinkComponent;
  let fixture: ComponentFixture<ColddrinkComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ColddrinkComponent]
    });
    fixture = TestBed.createComponent(ColddrinkComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
